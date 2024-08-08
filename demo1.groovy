pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from Git repository
                git branch: 'main', url: 'https://github.com/Sohamsakec/sakec_demo1.git'
            }
        }
        stage('Build') {
            steps {
                // Build steps here
                echo 'Building...'
                // Example build step
                withMaven(maven: 'M3') {
                    sh 'mvn clean install'
                }
            }
        }
    }
}
