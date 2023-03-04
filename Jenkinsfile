// Builds the plugin using https://github.com/jenkins-infra/pipeline-library
buildPlugin(useContainerAgent: true, configurations: [
  // Test the minimum required Jenkins Version.
  [ platform: 'linux', jdk: '11', jenkins: null ],
  [ platform: 'windows', jdk: '11', jenkins: null ],
  [ platform: 'linux', jdk: '17', jenkins: null ],
  [ platform: 'windows', jdk: '17', jenkins: null ]
])
