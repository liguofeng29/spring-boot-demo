package org.lee.spring.boot.demo.cache;

import org.hibernate.annotations.Cache;
import org.lee.spring.boot.demo.model.User;
import org.lee.spring.boot.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@CacheConfig(cacheNames = "sampleCache1")
@Repository
public class UserCacheServiceImpl implements UserCacheService {
    @Autowired
    private UserRepository userRepository;

    @Cacheable(key = "#p0")
    @Override
    public User readUser(Integer id) {
        System.out.println(id);

        System.out.println("キャッシュがないので、再検索する。");
        return userRepository.findOne(id);
    }

    @CachePut(key = "#p0")
    @Override
    public User updateUser(User user) {
        System.out.println("キャッシュを更新する。");
        return userRepository.save(user);
    }

    @CachePut(key = "#p0")
    @Override
    public User createUser(User user) {
        System.out.println("キャッシュを登録する。");
        return userRepository.save(user);
    }

    @CacheEvict(key = "#p0")
    @Override
    public void deleteUser(Integer id) {
        System.out.println("キャッシュを削除する。");
        userRepository.delete(id);
    }
}
