node {
  stage('SCM Checkout') {
    
    git 'https://github.com/jcallealamo/projectredis.git'
  }
  
  stage('Compile-Package') {
    def mvnHome = tool name: 'M2_HOME', type: 'maven'
    bat'mvn clean compile'
  }
}
