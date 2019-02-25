def gitUrl = 'https://github.com/massinissamohellebi/DevOps-Eval.git'

job('V1-job') {
    scm {
        git(gitUrl)
    }
    steps {
        shell('docker-compose up -d')
    }
}
