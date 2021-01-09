pipeline {
    agent any
    environment{
        CC = """${
            sh(
                returnStdout:true,
                script: 'echo "clang"'
            )}"""


        EXIT_STATUS = """${sh(
            returnStatus: true,
            script: 'exit 1'


        )}"""

    }
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
        environment{
            DEPLOY_FLAGS = 'g'
        }
            steps {
                echo 'Deploying....'
                sh 'printenv'
            }
        }
    }
}