node{
    stage('Preparation'){
        checkout scm
    }
    
    stage('Build'){
        sh 'docker run -i --rm --name my-maven-project -v "$PWD":/usr/src/mymaven -w /usr/src/mymaven maven:3-jdk-8 mvn clean package'
    }
    
    stage('Results'){
        junit '**/target/surefire-reports/TEST-*.xml'
        archiveArtifacts 'target/gildedrose-*.jar'
    }
    
    stage('javadoc'){
        sh 'docker run -i --rm --name my-maven-project -v "$PWD":/usr/src/mymaven -w /usr/src/mymaven maven:3-jdk-8 mvn site'
        archiveArtifacts 'target/site/'
    }
}

