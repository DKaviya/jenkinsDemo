pipeline {

    agent any
    tools {
        maven 'Maven 3.8.1' 
    }
    stages {
        stage('Compile stage') {
            steps {
                bat "mvn clean compile" 
        }
    }
          stage('deployment stage') {
              steps {
                bat "mvn deploy"
        }
    }

  }

}