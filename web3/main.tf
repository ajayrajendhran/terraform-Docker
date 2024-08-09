terraform {
  required_providers {
    docker = {
      source  = "kreuzwerker/docker"
      version = "~> 3.0"
    }
  }
}

provider "docker" {
  host = "unix:///var/run/docker.sock"
}

resource "docker_image" "web_image" {
  name = "mywebsite:latest"
  build {
    context = "."
  }
}

resource "docker_container" "web_container" {
  image = docker_image.web_image.image_id
  name  = "my_container"

  ports {
    internal = 80
    external = 8086
  }
}

output "website_url" {
  value = "http://localhost:8086"
}
