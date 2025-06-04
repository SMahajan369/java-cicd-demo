pipeline {
    agent any

    tools {
        maven 'Maven' // Adjust to match your Jenkins tool config
        jdk 'openjdk-21'        // Adjust to your JDK name
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main' , url: 'https://github.com/SMahajan369/java-cicd-demo.git' // Replace with your repo
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploy step placeholder - add deployment script here'
            }
        }
    }

    post {
        success {
            echo 'Pipeline completed successfully.'
        }
        failure {
            echo 'Pipeline failed.'
        }
    }
}
