# Git & Github

💡 git config --global user.name "Roy"
// to set global username

💡 git config --global user.email email
//to set global user email

💡 git init
//initialize git the folder as git repo

💡 git status
//to check current status of git repo

💡 git pull origin master
// pulling changes from remote to local master

💡 git add .
// to add files of current folder to git repo .here . means all files

💡 git restore .
// To restore all changes til previous commit

💡 git commit -m "message for commit"
//commit the changes made in current folder

💡 git log --oneline
//get the log for all previous commits on git

💡 git checkout <commit file number from log> filenameWithExt
//used to go back to a previous commit state

💡 git switch branchname
//used to switch to another branch

💡 git remote show origin
// showing origin

💡 git remote rm origin
// remove origin

💡 git reset HEAD filenameWithExt
//reset changes to last commit i.e head commit

////going online

💡git remote add origin "url of the online repo on github"
//used to link to online git repo

💡git remote set-url origin "url of the online repo on github"
//used to link to online git repo

💡git push -u origin master
//push current folder online on github

💡git branch
//List all the branches in repository

💡git branch "banchname"
// create new branch with branch name

💡 git branch --show-current
// current branch name

💡git checkout branchname
//Move to the specific branch
git checkout master ////Move to master

💡git merge banchname
// Merge current branch with another branchname

💡git reset --hard
//To remove any local changes you have

💡git congif --global core.autocrlf true // on windows

💡git congif --global core.autocrlf input // on mac
// to desible newline /carrige return