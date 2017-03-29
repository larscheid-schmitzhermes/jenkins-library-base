package com.ibm.oip.jenkins.steps.deployment

import com.ibm.oip.jenkins.steps.Step
import com.ibm.oip.jenkins.ega.steps.deployment.cloudfoundry.*;
import com.ibm.oip.jenkins.ega.steps.deployment.docker.*

class Deployment {
    public static Step CLOUDFOUNDRY(String targetEnv) {
        return new CloudFoundryDeployment(targetEnv);
    }
    
    public static Step IBM_CONTAINER(String targetEnv) {
        return new IBMContainerDeployment(targetEnv);
    }
}