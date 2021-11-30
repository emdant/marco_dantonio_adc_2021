# Git Protocol
Design and develop the Git protocol, distributed versioning control on a P2P network. Each peer can manage its projects (a set of files) using the Git protocol (a minimal version).

The system allows the users to create a new repository in a specific folder, add new files to be tracked by the system, apply the changing on the local repository (commit function), push the network’s changes, and pull the changing from the network.

The git protocol has lot-specific behavior to manage the conflicts; in this version, it is only required that if there are some conflicts, the systems can download the remote copy, and the merge is manually done. As described in the [GitProtocol Java API](https://github.com/spagnuolocarmine/distributedsystems-unisa/blob/master/homework/GitProtocol.java).