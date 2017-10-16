package org.lee.spring.boot.demo.cache;

import org.lee.spring.boot.demo.model.User;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

public interface UserCacheService {

    public User readUser(Integer id);

    public User updateUser(User user);

    public User createUser(User user);

    public void deleteUser(Integer id);
}
