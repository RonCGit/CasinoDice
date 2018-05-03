pipeline {
  agent any
  stages {
    stage('build')
      steps {
        sh 'echo Building ${BRANCH_NAME}...'
        { checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/RonCGitJenkins/CasinoDice.git']]])
      }
    }
  }
}
