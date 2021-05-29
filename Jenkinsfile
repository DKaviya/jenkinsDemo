pipeline{

    agent any

    stages {

        stage ('Compile Stage') {

            steps {

                maven(maven: 'maven_3_8_1') {
                    sh 'mvn clean install'

                }

            }
        }

    }

}