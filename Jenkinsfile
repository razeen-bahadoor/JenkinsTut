pipeline {
    agent any

    environment{

        DEBUG_FLAGS = '-g'
    }


    // global dynamic environment
    environment{
        awesomeVersion = sh(returnStdout: true, script: 'echo 0.0.1')

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
    // read properties from a file (pipeline utilities steps plugin reuqired)

    stages {
       stage("read properties from file") {
           steps{
                script{
                     def properties = readProperties file: 'props.properties'
                                           env.WEATHER = properties.WEATHER;
                                           env.YEAR = properties.YEAR

                }
           }

        }
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
        //local environment
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