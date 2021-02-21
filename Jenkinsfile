node {
  agent any
  
    tools {
        maven 'apache-maven-3.6.3' 
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
    
}
