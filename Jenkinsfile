pipeline{

    agent none

	stages {
        stage('Building Projects') {
            agent {
                node {label 'Docker-builder'}
        }
        steps{
        sh 'export'
        
        sh 'chmod 755 ./build-project.sh'
        sh './build-project.sh' false
        }
    }
}