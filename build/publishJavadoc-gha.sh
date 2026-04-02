#!/bin/bash

# Required environment variables:
# GH_TOKEN
# GH_REPO_SLUG
# GH_TAG

set -e

printf "\n>>>>> Publishing javadoc for release build: repo=%s tag=%s\n" ${GH_REPO_SLUG} ${GH_TAG}

printf "\n>>>>> Cloning repository's gh-pages branch into directory 'gh-pages'\n"
rm -rf ./gh-pages

git config --global user.email "github-actions@github.com"
git config --global user.name "github-actions"

git clone --branch=gh-pages https://x-access-token:${GH_TOKEN}@github.com/${GH_REPO_SLUG}.git gh-pages

printf "\n>>>>> Finished cloning...\n"

pushd gh-pages

# Copy javadocs
printf "\n>>>>> Copying javadocs to docs/%s\n" ${GH_TAG}
rm -rf docs/${GH_TAG}
mkdir -p docs/${GH_TAG}
cp -rf ../target/site/apidocs/* docs/${GH_TAG}

# Generate index
printf "\n>>>>> Generating gh-pages index.html...\n"
if [ -f ../build/generateJavadocIndex.sh ]; then
  ../build/generateJavadocIndex.sh > index.html
fi

# Commit & push
printf "\n>>>>> Committing new javadoc...\n"
git add -f .
git commit -m "docs: latest javadoc for ${GH_TAG}" || echo "No changes to commit"
git push origin gh-pages

popd

printf "\n>>>>> Published javadoc for release build: repo=%s tag=%s\n" ${GH_REPO_SLUG} ${GH_TAG}
