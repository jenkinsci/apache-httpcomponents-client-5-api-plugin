// Builds the plugin using https://github.com/jenkins-infra/pipeline-library
buildPlugin(useContainerAgent: true, configurations: [
  // Test the minimum required Jenkins Version.
  [ platform: 'linux', jdk: '11'],
  [ platform: 'windows', jdk: '17'],
  [ platform: 'linux', jdk: '21']
])
