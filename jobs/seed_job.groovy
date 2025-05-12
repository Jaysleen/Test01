job('Generated-Job') {
    description('Auto-created job from DSL script')

    scm {
        git('https://github.com/your-username/sample-project.git', 'main')
    }

    steps {
        shell('echo "Hello from the auto-generated job!"')
    }

    triggers {
        scm('H/5 * * * *') // Poll every 5 mins
    }
}
