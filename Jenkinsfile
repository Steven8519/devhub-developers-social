node {
  def image
  def mvnHome = tool 'Maven3'
     stage ('checkout') {
        git credentialsId: 'GIT_CREDENTIALS', url:  'https://github.com/Steven8519/devhub-developers-social.git', branch: 'master'
     }

    stage ('Build') {
            maven_invoker invokerBuildDir: 'target/it', reportsFilenamePattern: 'target/invoker-reports/BUILD*.xml'
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
            configs: 'devhub-developer-social/manifest.yml',
            kubeconfigId: 'K8S',
            enableConfigSubstitution: true
        )
    }

}