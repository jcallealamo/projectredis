node {
  stage('SCM Checkout') {
    
    git 'https://github.com/jcallealamo/projectredis.git'
  }
  
  stage('Compile-Package') {
    withMaven(maven : 'apache-maven-3.6.3') {
      bat'mvn clean compile'
    }
  }
}
