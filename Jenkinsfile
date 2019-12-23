pipeline {
  agent {
    docker {
      image 'maven:3.6.2-jdk-13'
    }

  }
  stages {
    stage('Initialise') {
      steps {
        sh 'mvn clean'
      }
    }

    stage('Build') {
      steps {
        sh 'mvn -Dmaven.test.failure.ignore=true install'
      }
    }

    stage('Report') {
      steps {
        junit '**/target/surefire-reports/*.xml'
      }
    }

    stage('Archive') {
      steps {
        archiveArtifacts 'target/*.jar'
      }
    }

  }
  environment {
    registryCredential = 'dockerhub'
  }
}