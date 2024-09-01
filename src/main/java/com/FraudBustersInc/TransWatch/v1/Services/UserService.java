package com.FraudBustersInc.TransWatch.v1.Services;

import com.FraudBustersInc.TransWatch.v1.Entities.UserEntity;
import com.FraudBustersInc.TransWatch.v1.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public void createUser() {
        UserEntity user1 = new UserEntity();
        user1.setUserName("Blackbird1123 this is Sukhoi");
        user1.setEmail("climbandmaintainfl550@email.com");
        user1.setPassword("784100");

        UserEntity user2 = new UserEntity();
        user2.setUserName("Falcon9 Ground Control");
        user2.setEmail("launchdirector@spaceway.mission");
        user2.setPassword("starlight987");

        UserEntity user3 = new UserEntity();
        user3.setUserName("PhantomPilot F22");
        user3.setEmail("eagleeyes@stealthops.secret");
        user3.setPassword("invis123");

        UserEntity user4 = new UserEntity();
        user4.setUserName("HawkEye Recon");
        user4.setEmail("nightwatch@skydome.intel");
        user4.setPassword("targetacquired2024");

        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);
        userRepository.save(user4);
    }
}
