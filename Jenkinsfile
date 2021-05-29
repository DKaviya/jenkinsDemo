pipeline{

    agent any

	stages {
        stage('Building Projects') {
            withMaven(maven: 'maven_3_8_1') {
                    sh 'mvn clean install'

                }
         }

    }
}
