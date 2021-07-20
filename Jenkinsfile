node {
  def image
  def mvnHome = tool 'Maven3'
     stage ('checkout') {
        git credentialsId: 'GIT_CREDENTIALS', url:  'https://github.com/Steven8519/devhub-developers-social.git', branch: 'master'
     }

    stage ('Maven Test') {
            sh 'mvn test'
    }

    stage ('Docker Build') {
         // Build and push image with Jenkins' docker-plugin
            withDockerRegistry([credentialsId: "dockerhub", url: "https://index.docker.io/v1/"]) {
            image = docker.build("steven8519/userapp", "MyAwesomeApp")
            image.push()
            }
        }

      stage ('K8S Deploy') {
        kubernetesDeploy(
            configs: 'manifest.yml',
            kubeconfigId: 'K8S',
            enableConfigSubstitution: true
        )
    }

}