
pipeline {
    agent any
    stages {
        stage('git'){
            steps{
                git branch: 'main', url: 'https://github.com/Haozhen-Shu/HandsOnJenkins.git'
            }
        }
        stage('Build'){
            steps {
                sh 'mvn -DskipTests clean package'
            }
        }

        stage('Test'){
            steps {
                sh 'mvn test'
            }
            post{
                always{
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
    }
    post {
        always {
            archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
                }
            }
    }

