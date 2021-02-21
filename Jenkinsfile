node {
  agent any
  
    tools {
        maven 'Maven_3.5.2' 
    }
  
  stage('SCM Checkout') {
    
    git 'https://github.com/jcallealamo/projectredis.git'
  }
  
    stages {
        stage('Compile stage') {
            steps {
                bat "mvn clean compile" 
        }
    }
}
