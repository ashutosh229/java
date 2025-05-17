#!/bin/bash

# Default commit message (optional)
commit_mesage = "updated"

# Parse named parameters
while [[ "$#" -gt 0 ]]; do
  case $1 in
    -m|--message) 
      commit_message="$2"
      shift 2
      ;;
    *)
      echo "Unknown parameter passed: $1"
      exit 1
      ;;
  esac
done

# Check if commit message is provided
if [[ -z "$commit_message" ]]; then
  echo "Error: Commit message is required. Use -m or --message flag."
  exit 1
fi

# Git commands
git add .
git commit -m "$commit_message"
git push -u origin main