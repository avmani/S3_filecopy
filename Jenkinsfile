// pipeline{
//     parameters{
//         string defaultValue: 'mani-cmdfprv-qa2-rawdata-streamingfxtr-euwest1-s3', name: 'Source_Bucket', trim: true
//         string defaultValue: 'staging', name: 'Folder to Sync', trim: true 
//         choice ( name: 'Destination_Bucket', choices: 'mani-cmdfprv-dev-rawdata-streamingfxtr-euwest1-s3'\'mani-cmdfprv-qa-qawdata-streamingfxtr-ewwest1-s3')
//         string(defaultValue: 'staging/venue=fxt', name: 'Folders to Exclude')
//     }
// }

// pipeline {
//     agent any
//     parameters {
//         string(name: 'Source_Bucket', defaultValue: 'mani-cmdfprv-qa2-rawdata-streamingfxtr-euwest1-s3', description: 'Source Bucket')
//         string(name: 'Destination_Bucket', defaultValue: 'mani-cmdfprv-dev-rawdata-streamingfxtr-euwest1-s3', description: 'Destination Bucket')
//     }
// }

pipeline {
    agent any
    parameters {
        string(name: 'Source_Bucket', defaultValue: 'bucket-000001', description: 'Source Bucket')
        choice(name: 'Destination_Bucket', choices: ['bucket-000002', 'bucket-000003'], description: 'Pick something')
    }
    stages {
        stage('Example') {
            steps {
                echo "${params.Greeting} World!"
            }
        }
    }
}

// pipeline {
//     agent any

//     environment {
//     AWS_ACCESS_KEY_ID     = credentials('jenkins-aws-secret-key-id')
//     AWS_SECRET_ACCESS_KEY = credentials('jenkins-aws-secret-access-key')
//     }

//     parameters {
//         string(name: 'Source_Bucket', defaultValue: 'bucket-000001', description: 'Source Bucket')
//         choice(name: 'Destination_Bucket', choices: ['bucket-000002', 'bucket-000003'], description: 'Pick something')

//     }

//     stages {
//         stage('test AWS credentials') {
//             steps {
//                 withAWS(credentials: 'jenkins-test-user', region: 'ap-south-1') {
//                     sh 'echo "hello Jenkins">hello.txt'
//                     s3Upload acl: 'Private', bucket: 'techhub-input-data-1', file: 'hello.txt'
//                     s3Download bucket: 'devopslee', file: 'downloadedHello.txt', path: 'hello.txt'
//                     sh 'cat downloadedHello.txt'
//                 }
//             }
//         }
//     }
// }


// pipeline {
//     agent any

//     environment {
//     AWS_ACCESS_KEY_ID     = credentials('AWS_ACCESS_KEY_ID')
//     AWS_SECRET_ACCESS_KEY = credentials('AWS_SECRET_ACCESS_KEY')
//     }

//     parameters {
//         string(name: 'Source_Bucket', defaultValue: 'bucket-000001', description: 'Source Bucket')
//         string(name: 'Source_path', defaultValue: 'staging', description: 'Source Bucket')
//         string(name: 'Exclude_path', defaultValue: 'staging/venue=fxtr/', description: 'Source Bucket')
//         choice(name: 'Destination_Bucket', choices: ['bucket-000002', 'bucket-000003'], description: 'Pick something')
//         string(name: 'Destination_path', defaultValue: 'staging', description: 'Source Bucket')

//     }

//     stages {
//         stage('Sync S3') {
//             steps {
//                     sh 'aws s3 sync s3://${Source_Bucket}/${Source_path} s3://${Destination_Bucket}/${Destination_path} --exclude "${Exclude_path}"'

//             }

//         }
//     }
// }


// pipeline {
//     agent any

//     environment {
//     AWS_ACCESS_KEY_ID     = credentials('AWS_ACCESS_KEY_ID')
//     AWS_SECRET_ACCESS_KEY = credentials('AWS_SECRET_ACCESS_KEY')
//     }

//     parameters {
//         string(name: 'Source_Bucket', defaultValue: 'bucket-000001', description: 'Source Bucket')
//         string(name: 'Source_path', defaultValue: 'staging', description: 'Source Bucket')
//         string(name: 'Exclude_path', defaultValue: 'staging/venue=fxtr/', description: 'Source Bucket')
//         choice(name: 'Destination_Bucket', choices: ['bucket-000002', 'bucket-000003'], description: 'Pick something')
//         string(name: 'Destination_path', defaultValue: 'staging', description: 'Source Bucket')

//     }

//     stages {
//         stage('Sync S3') {
//             steps {
//                     sh 'aws s3 sync s3://${Source_Bucket}/${Source_path} s3://${Destination_Bucket}/${Destination_path} --exclude "${Exclude_path}"'

//             }

//         }
//     }
// }


pipeline {
    agent any

    environment {
    AWS_ACCESS_KEY_ID     = credentials('AWS_ACCESS_KEY_ID')
    AWS_SECRET_ACCESS_KEY = credentials('AWS_SECRET_ACCESS_KEY')
    }

    parameters {
        string(name: 'Source_Bucket', defaultValue: 'bucket-000001', description: 'Source Bucket')
        string(name: 'Source_path', defaultValue: 'staging', description: 'Source Bucket')
        string(name: 'Exclude_path', defaultValue: 'venue=fx*', description: 'Source Bucket')
        choice(name: 'Destination_Bucket', choices: ['bucket-000002', 'bucket-000003'], description: 'Pick something')
        string(name: 'Destination_path', defaultValue: 'staging', description: 'Source Bucket')

    }

    stages {
        stage('Sync S3') {
            steps {
                    sh 'aws s3 sync s3://${Source_Bucket}/${Source_path} s3://${Destination_Bucket}/${Destination_path} --exclude "${Exclude_path}"'

            }

        }
    }
}



