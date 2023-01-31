pipeline {
    
    agent any

    tools {
       
        maven "MY_MAVEN"
    }

    
    stages {
        stage('clean and checkout') {
            dir('backend')
            steps {
                sh 'pwd'
                sh 'mvn clean'
                echo 'downloading github project...'
                git branch: 'main', credentialsId: 'SaharMortazavi', url: 'https://github.com/SaharMortazavi/SysProgUppgoft2.git'
            }
            
     }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
            
       
        stage('build') {
            steps {
                echo 'building...'
                sh 'mvn test-compile'
                echo 'finished building'
            }
        }

       

        stage('package') {
            steps {
                echo 'packaging...'
                sh 'mvn war:war'
                echo 'packaged'
            }
        }
    }

    
}
