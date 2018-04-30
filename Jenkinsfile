pipeline{
  agent any

  stages{

    stage('Compile Stage'){
      steps{
        withMaven(maven: 'myMaven'){
          sh 'mvn clean compile'
        }
      }
    }

    stage('Testing Stage'){
      steps{
        withMaven(maven: 'myMaven'){
          sh 'mvn test'
        }
      }
    }

  }
}
