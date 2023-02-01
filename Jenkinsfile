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
                git branch: 'master', credentialsId: 'zeynepcs', url: 'https://github.com/SaharMortazavi/SysProgUppgoft2.git'
            }
            
     }
       
        stage('build') {
            steps {
                echo 'building...'
                sh 'mvn test-compile'
                echo 'finished building'
            }
        }

        stage('Test') {
            steps {
                echo 'starting test.....'
                sh 'mvn surefire:test'
                echo 'finished test'
            }

        stage('package') {
            steps {
                echo 'packaging...'
                sh 'mvn war:war'
                echo 'packaged'
            }
        }
    }
