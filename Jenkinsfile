pipeline {
    
    agent any

    tools {
       
        maven "MY_MAVEN"
    }

    stages {
        stage('clean and checkout') {
            steps {
            dir("backend") {
                sh 'mvn clean -f backend'
                echo 'downloading github project...'
                git branch: 'master', credentialsId: 'zeynepcs', url: 'https://github.com/SaharMortazavi/SysProgUppgoft2.git'
            }            
     }
  }  
        
        stage('build') {
           steps {
            dir("backend") {
                echo 'building...'
                sh 'mvn package -f backend'
                echo 'finished building'
            }
        }
      }  
         stage('deploy') {
           steps {
            dir("backend") {
                echo 'deploying...'
                sh 'cp backend/target/ROOT.war /artifacts'
                echo 'deployed'
            }
        }
    }
 }
 }
