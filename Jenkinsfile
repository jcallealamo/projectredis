node {
  stage('SCM Checkout') {
    
    git 'https://github.com/jcallealamo/projectredis.git'
  }
  
  stage('Compile-Package') {
    def mvnHome = tool name: 'M3', type: 'maven'
    bat "&{mvnHome}/bin/mvn package"
  }
}
