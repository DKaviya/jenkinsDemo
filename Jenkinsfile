pipeline{

    agent any

	stages {
        stage('Building Projects') {
		steps {
		    withMaven(maven: 'maven 3.8.1') {
			    sh 'mvn clean install'
		    }
		}
         }

    }
}
