pipeline {
  agent any
  stages {
    stage('Script') {
      steps {
        sh 'echo "Hello !"'
        sh '/disk/sbt/bin/sbt test'
      }
    }
  }
}

