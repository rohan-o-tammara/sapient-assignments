node {
    def commit-id 
    stage('Prep') {
        checkout scm
        sh "git rev-parse --short HEAD > .git/commit-id"
        commit-id = readFile('.git/commit-id').trim()
    }
    stage('Build') {
        sh "mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
    }
}
