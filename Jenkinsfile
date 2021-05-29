pipeline{

    agent any
	tools{
	   jdk "java8"
	}
	stages {
        stage('Building Projects') {
		steps {
		    withMaven(maven: 'maven 3.8.1') {
			    bat 'mvn clean install'
		    }
		}
         }

    }
}
