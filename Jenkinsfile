pipeline {
    agent any

    environment {
        dockerImage = ''
        registry = 'bounajia/Search:latest'
        registryCredential = 'dockerhub_id'
    }

    stages {
        stage('checkout') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], userRemoteConfigs: [[url: 'https://github.com/CBI-DevOps-PFE/Api_search.git']]])
            }
        }

        stage('build docker img') {
            steps {
                script {
                  dockerImage = docker.build(registry.toLowerCase(), "--build-arg JAR_FILE=/app/target/Login.jar .")
              }
            }
        }

        stage('Test') {
            steps {
                script {
                    // Add test commands or scripts here
                    sh 'echo "Running tests"'
                }
            }
        }

        stage('uploading img') {
            steps {
                script {
                    docker.withRegistry('', registryCredential) {
                        dockerImage.push()
                    }
                }
            }
        }
    }
}
