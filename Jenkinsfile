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
           dir('backend')
            steps {
                echo 'building...'
                sh 'mvn package'
                echo 'finished building'
            }
        }
        
         stage('deploy') {
            dir('backend')
            steps {
                echo 'deploying...'
                sh 'cp backend/target/ROOT.war /artifacts'
                echo 'deployed'
            }
        }
    }
}
