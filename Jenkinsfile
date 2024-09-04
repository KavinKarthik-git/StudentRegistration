pipeline {
  agent { label 'Jenkins_Agent' }
  tools {
    jdk 'Java21'
    maven 'Maven3'
  }
  stages{
      stage("Cleanup Workplace"){
              steps {
              cleanWs()
              }
    }
    stage("Checkout from SCM"){
            steps {
            git branch: 'main', credentialsId: 'github' , url: 'https://github.com/KavinKarthik-git/StudentRegistration'
            }
    }
    stage("Build Application"){
            steps {
            sh "mvn clean package"
            }
    }
    stage("Test Application"){
            steps {
            sh "mvn test"
            }
    }
  }
}
