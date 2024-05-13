pipeline {
    agent any

    tools {
        maven 'Maven'
    }
    environment {
        dockerImage = ''
        registry = 'bounajia/search:latest'
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
                    // Construire l'image Docker et la taguer avec le nom de l'image Docker
                    sh 'docker build -t bounajia/search:latest .'
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    sh 'echo "Running tests"'
                }
            }
        }

        stage('uploading img') {
            steps {
                script {
                    // Pousser l'image Docker vers le registre Docker
                    docker.withRegistry('', registryCredential) {
                         sh 'docker push bounajia/search:latest '
                    }
                }
            }
        }
    }
}
