def gitUrl = 'https://github.com/massinissamohellebi/DevOps-Eval.git'

job('V1-job') {
    scm {
        git(gitUrl,'V1')
    }
    steps {
        shell('echo "toto"')
    }
}
