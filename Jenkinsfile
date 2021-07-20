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
        withCredentials([string(credentialsId: 'DOCKER_HUB', variable: 'DOCKER_HUB')]) {
             sh "docker login -u steven8519 -p ${DOCKER_HUB}"
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