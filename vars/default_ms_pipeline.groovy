



void call(Closure body) {

    body.resolveStrategy = Closure.DELEGATE_FIRST

    echo 'before delegate to string start'
    echo this.toString()
    echo'before delegate to string start ending '
    body.delegate = this; body()

  echo 'after delegate to string start'
  echo this.toString()


  body.delegate = env; body()

    echo this.toString()

    node {
        sh 'env'
    }



}
