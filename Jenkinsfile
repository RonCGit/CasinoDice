pipeline {
  agent any
  stages {
    stage('checkout') { checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/RonCGitJenkins/CasinoDice.git']]])
      steps {
        sh 'echo Building ${BRANCH_NAME}...'
      }
    }
  }
}
