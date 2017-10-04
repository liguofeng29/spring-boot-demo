package org.lee.spring.boot.demo;

import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Application.class);
		//******************************//
		// customize SpringApplication  //
		//******************************//

		// app.setBannerMode(Banner.Mode.CONSOLE);
		// app.setWebEnvironment(true);

		// Application events and listeners
		// ApplicationStartingEvent            is sent at the start of a run, but before any processing except the registration of listeners and initializers.
		// ApplicationEnvironmentPreparedEvent is sent when the Environment to be used in the context is known, but before the context is created.
		// ApplicationPreparedEvent            is sent just before the refresh is started, but after bean definitions have been loaded.
		// ApplicationReadyEvent               is sent after the refresh and any related callbacks have been processed to indicate the application is ready to service requests.
		// ApplicationFailedEvent              is sent if there is an exception on startup.
		app.addListeners(
				(ApplicationListener<ApplicationStartingEvent>) event -> System.out.println("###### ApplicationStartingEvent ######")
		);
		app.addListeners(
				(ApplicationListener<ApplicationReadyEvent>) event -> System.out.println("###### ApplicationReadyEvent ######")
		);

		// depending on whether you are developing a controller application or not.
		// It is often desirable to call setWebEnvironment(false) when using SpringApplication within a JUnit test.
		app.setWebEnvironment(true);

		app.run(args);
	}

    @Bean
    public ExitCodeGenerator exitCodeGenerator() {
        // return new ExitCodeGenerator() {
        //    @Override
        //    public int getExitCode() {
        //        return 42;
        //    }
        // };

        // ステートメントラムダ式
        // return () -> {return 42;};

        // 式ラムダ
        return () -> 42;
    }

    /** unable to find a single main class  **/
//    public static void main(String[] args) {
//        System.exit(SpringApplication
//                .exit(SpringApplication.run(ExitCodeApplication.class, args)));
//    }

}
