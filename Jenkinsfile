node {
  def image
  def mvnHome = tool 'Maven3'
     stage ('checkout') {
        git credentialsId: 'GIT_CREDENTIALS', url:  'https://github.com/Steven8519/devhub-developers-social.git', branch: 'master'
     }

    stage('Build Docker Image'){
            sh 'docker build -t steven8519/userapp .'
        }
    stage('Push Docker Image'){
        withCredentials([string(credentialsId: 'dockerhub', variable: 'dockerhub')]) {
             sh "docker login -u steven8519 -p ${dockerhub}"
        }
             sh 'docker push steven8519/userapp '
    }

      stage ('K8S Deploy') {
        kubernetesDeploy(
            configs: 'manifest.yml',
            kubeconfigId: 'K8S',
            enableConfigSubstitution: true
        )
    }

}