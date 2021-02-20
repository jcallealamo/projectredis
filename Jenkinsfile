node {
  stage('SCM Checkout') {
    git 'https://github.com/jcallealamo/projectredis.git'
  }
  
  stage('Compile-Package') {
    sh 'mvn package'
  }
}
