node {
  stage('SCM Checkout') {
    
    git 'https://github.com/jcallealamo/projectredis.git'
  }
  
  stage('Compile-Package') {
    def mvnHome = tool name: 'M2', type: 'maven'
    bat'mvn clean compile'
  }
}
