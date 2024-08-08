pipeline {
    agent any

    stages {
        stage('Hello World') {
            steps {
                script {
                    // Groovy code to print "Hello, World!"
                    def message = "Hello, World!"
                    echo message
                }
            }
        }
    }
}
