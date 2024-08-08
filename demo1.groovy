pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from the Git repository
                git 'https://github.com/your-repo/your-project.git'
            }
        }
        stage('Build') {
            steps {
                // Build the project using Maven
                withMaven(maven: 'M3') {
                    sh 'mvn clean install'
                }
            }
        }
        stage('Test') {
            steps {
                // Run tests
                withMaven(maven: 'M3') {
                    sh 'mvn test'
                }
            }
        }
        stage('Deploy') {
            steps {
                // Deploy the build artifacts
                echo 'Deploying...'
                // Add deployment steps here
            }
        }
    }
    
    post {
        success {
            echo 'Build and Deployment succeeded!'
        }
        failure {
            echo 'Build or Deployment failed!'
        }
    }
}

