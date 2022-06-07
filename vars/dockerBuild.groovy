#!/usr/bin/env groovy

def call(tring APP_IMAGE_REGISTRY, String APP_IMAGE_REPOSITORY) {

    dir("${WORKSPACE}") {
        sh "echo test"
        sh "docker build -t ${APP_IMAGE_REGISTRY}/${APP_IMAGE_REPOSITORY}:\$(git rev-parse HEAD) ."
    //   sh "echo $DOCKERHUB_CRED_PSW | docker login -u $DOCKERHUB_CRED_USR --password-stdin"
    //   sh "docker push ${APP_IMAGE_REGISTRY}/${APP_IMAGE_REPOSITORY}:\$(git rev-parse HEAD)"
    }

}